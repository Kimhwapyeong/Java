package com.chap2;
//0404
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIO {
	public static void main(String[] args) {
		FileIO io = new FileIO();
		//io.fileIOCopy();
		io.fileCopy();
		//io.fileCopy2();
	}
	
	/**
	 * 파일 복사하기
	 * A_file.java 파일을 읽어서
	 * A_File_copy.java 파일을 생성합니다
	 */
	public void fileIOCopy() {
		
		long StartTime, EndTime;
		// 시작시간
		StartTime = System.currentTimeMillis();
		
		File file = new File("D:\\workspace\\git\\IOEx_0403\\src\\com\\chap1\\A_file.java");
		// 파일의 존재 여부를 확인 후 존재하지 않으면 종료
		if(!file.exists()) {
			System.out.println("파일이 존재하지 않습니다.");
			return;
		}
		try (FileInputStream fis = new FileInputStream(file);
				FileOutputStream fos = new FileOutputStream("A_File_copy.java")) {
			
			int value = 0;
			// 1바이트씩 읽어온다
			// -1 EndOfFile
			int i = 0;
			byte[] byteArr = new byte[100];
			// i = 바이트 배열에 읽어온 갯수를 반환합니다.
			while((i = fis.read(byteArr)) != -1) {
				// 읽어온 갯수만큼 출력합니다.
				// 마지막 출력 시 배열의 갯수를 다 채우지 못하면
				// 이전에 남아있는 배열의 데이터가 출력되므로 필요한 로직이다.
				fos.write(byteArr, 0, i);   // byteArr의 0번째 index부터 i번째 index까지
			}
//			while((value = fis.read()) != -1) {
//				fos.write(value);
//			}
			
			fos.flush();
			
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		
		EndTime = System.currentTimeMillis();
		System.out.println("소요시간 : " + (EndTime - StartTime));
	}
	
	public void fileCopy() {
		
		long StartTime, EndTime;
		StartTime = System.currentTimeMillis();
		
		// 파일 복사하기
		File file = new File("D:\\workspace\\git\\IOEx_0403\\10_1_예외클래스.pptx");
		
		if(!file.exists()) {
			System.out.println("파일이 존재하지 않습니다.");
			return;
		}
		try(FileInputStream fis = new FileInputStream(file);
				FileOutputStream fos = new FileOutputStream("10_1_예외클래스_copy.pptx")){
			
			int value = 0;
			int i = 0;
			// 배열의 크기가 클 수록 빠르다.
			byte[] byteArr = new byte[1000];
			
			while((i = fis.read(byteArr)) != -1) {
			fos.write(byteArr, 0, i);
		}

			
//			while((value = fis.read()) != -1) {
//				fos.write(value);
//			}
			
			fos.flush();
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
			
		EndTime = System.currentTimeMillis();	
		System.out.println("소요시간 : " + (EndTime - StartTime));	
			
	}
	
	/**
	 * 복사하기 - 복사할 파일을 준비
	 * 
	 * FileInputStream 읽어와서
	 * FileOutputStream 저장하기
	 */
	public void fileCopy2() {
		try (FileInputStream fis = new FileInputStream("10_1_예외클래스.pptx");
				FileOutputStream fos = new FileOutputStream("10_1_예외클래스_copy2.pptx")){
			
			int value = 0;
			while((value = fis.read()) != -1) {
				fos.write(value);
			}
			
			fos.flush();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		// 파일 복사하기
		
	}
	
}
