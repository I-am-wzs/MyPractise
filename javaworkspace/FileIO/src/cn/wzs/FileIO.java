package cn.wzs;

import java.io.File;
import java.util.LinkedList;

public class FileIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file= new File("D:\\book");
		printFile(file);
		//traverseFolder1("D:\\book");
	}
	static void printFile(File file) {
		//for(int i = 0;i < level;i++) {
			System.out.println(file.getPath());
		//}
		//System.out.println("\\"+ file.getName());
		
		if(true == file.isDirectory()) {
			File[] files = file.listFiles();
			for(File tempFile:files) {
				printFile(tempFile);
			}
		}
	}
	
	public static void traverseFolder2(String path) {

        File file = new File(path);
        if (file.exists()) {
            File[] files = file.listFiles();
            if (null == files || files.length == 0) {
                System.out.println("文件夹是空的!");
                return;
            } else {
                for (File file2 : files) {
                    if (file2.isDirectory()) {
                        System.out.println("文件夹:" + file2.getAbsolutePath());
                        traverseFolder2(file2.getAbsolutePath());
                    } else {
                        System.out.println("文件:" + file2.getAbsolutePath());
                    }
                }
            }
        } else {
            System.out.println("文件不存在!");
        }
    }
	
	public static void traverseFolder1(String path) {
        int fileNum = 0, folderNum = 0;
        File file = new File(path);
        if (file.exists()) {
            LinkedList<File> list = new LinkedList<File>();
            File[] files = file.listFiles();
            for (File file2 : files) {
                if (file2.isDirectory()) {
                    System.out.println("文件夹:" + file2.getAbsolutePath());
                    list.add(file2);
                    folderNum++;
                } else {
                    System.out.println("文件:" + file2.getAbsolutePath());
                    fileNum++;
                }
            }
            File temp_file;
            while (!list.isEmpty()) {
                temp_file = list.removeFirst();
                files = temp_file.listFiles();
                for (File file2 : files) {
                    if (file2.isDirectory()) {
                        System.out.println("文件夹:" + file2.getAbsolutePath());
                        list.add(file2);
                        folderNum++;
                    } else {
                        System.out.println("文件:" + file2.getAbsolutePath());
                        fileNum++;
                    }
                }
            }
        } else {
            System.out.println("文件不存在!");
        }
        System.out.println("文件夹共有:" + folderNum + "，文件共有:" + fileNum);

    }
	
}
