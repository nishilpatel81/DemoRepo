package com.zinghr.init;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestData {

	public static String company_code = getCompanycodeFromExcel();
	public static String employe_code = getEmployeeCodeFromExcel();
	public static String password = getPasswordFromExcel();

	public static String company_code_dl = "KIWIQA123";
	public static String employe_code_dl = "Admin123";
	public static String password_dl = "Admin@1234";
	public static String company_code_emp = "ZINGQA0011";
	public static String employe_code_emp = "Admin";
	public static String password_emp = "Test@123";

	/*
	 * public static String intime = "12:00"; public static String outtime =
	 * "18:00";
	 */

	public static String shift_name = "abcd123";
	/*
	 * public static String intime = "08:30"; public static String outtime =
	 * "17:30";
	 */

	public static String company_code_se = "CYOLTESTTEST";
	public static String employe_code_se = "ADMIN";
	public static String password_se = "Baps@2000";
	public static String password_s = "Baps@200";
	public static String facebook = "https://www.facebook.com/zinghr";
	public static String twitter = "https://twitter.com/ZingHR";
	public static String youtube = "https://www.youtube.com/channel";
	public static String gplus = "https://plus.google.com/+Zinghr";
	public static String linkedin = "https://www.linkedin.com/company/zinghr";
	public static String full_time = "300";
	public static String half_time = "123";
	public static String mins = "30";
	public static String times = "3";
	public static String times2 = "2";
	public static String totol_times = "150";
	public static String extra_time_1 = "1";
	public static String extra_time_2 = "2";
	public static String extra_time_3 = "3";
	public static String extra_time_4 = "4";
	public static String extra_time_5 = "5";
	public static String extra_time_6 = "6";
	public static String extra_time_7 = "7";
	public static String extra_time_8 = "8";

	public static String more10 = "34654365435434564564";
	public static String blank = " ";
	public static String invalid = "%&^%6545as";

	public static String rndmString(int length) {
		String rnd1 = RandomStringUtils.randomAlphabetic(length).toUpperCase();
		return rnd1;

	}
	
	public static String rndmString2(int length) {
		String rnd1 = RandomStringUtils.randomAlphabetic(length);
		return rnd1;

	}


	public static int rndmNumber(int length) {

		Random randm = new Random();
		int numNoRange = randm.nextInt(99999);
		return numNoRange;

	}

	public static String alphanum(int i) {
		String alphanumeric = new StringBuilder(7).append("Test")
				.append(rndmNumber(2)).toString();
		return alphanumeric;
	}

	public static String rndmemail(int i) {
		String email = new StringBuilder(30).append("testkiwi")
				.append(rndmNumber(i)).append(rndmString(3))
				.append("@mailinator.com").toString();

		return email;
	}

	public static String rndm_invalid_email(int i) {
		String email = new StringBuilder(30).append("kw").append(rndmNumber(i))
				.append("@mi@ki").toString();
		return email;
	}

	public static String company_code_s = "Kiwitest";

	public static String dispayname_s = "Test";
	public static String email_s = "tarpan999@mailinator.com";
	public static String contactno_s = "9429186891";
	public static String invalidContactno = "dsjh(*&^(^(";
	public static String swipe_value = "12345";

	public static String lessthan3 = rndmString(2);
	public static String largeContactNum = new StringBuilder(14)
			.append(rndmNumber(14)).append(rndmNumber(14)).toString();

	public static int randBetween(int start, int end) {
		return start + (int) Math.round(Math.random() * (end - start));
	}

	static int hour1 = TestData.randBetween(7, 12); // Hours will be displayed
													// in between 9 to 22
	static int min = TestData.randBetween(0, 59);

	static int hour2 = TestData.randBetween(13, 20);

	public static String intime = hour1 + ":" + min;
	public static String outtime = hour2 + ":" + min;

	public static int diff = (((hour2) * 60) + min) - (((hour1) * 60) + min);

	public static String total_time = Integer.toString(diff);

	public static Sheet getExcelSheet(int sheetIndex) {
		String dataFilePath = "Resource/DataConfiguration.xlsx";
		File datafile = new File(dataFilePath);
		String fullpath = datafile.getAbsolutePath();
		Sheet firstSheet = null;

		try {

			System.out.println("full path " + datafile.getAbsolutePath()
					+ " con " + datafile.getCanonicalPath());

			FileInputStream inputStream = new FileInputStream(
					new File(fullpath));

			Workbook workbook = new XSSFWorkbook(inputStream);
			firstSheet = workbook.getSheetAt(sheetIndex);

			workbook.close();
			inputStream.close();

		} catch (Exception e) {

		}
		return firstSheet;
	}

	public static String getCompanycodeFromExcel() {

		return getExcelSheet(0).getRow(1).getCell(0).getStringCellValue();
	}

	public static String getEmployeeCodeFromExcel() {
		return getExcelSheet(0).getRow(1).getCell(1).getStringCellValue();

	}

	public static String getPasswordFromExcel() {
		return getExcelSheet(0).getRow(1).getCell(2).getStringCellValue();

	}

	public static String getURLFromExcel(String suiteName) {

		String url = null;
		if (suiteName.contains("SignUp")) {
			url = getExcelSheet(0).getRow(1).getCell(3).getStringCellValue();
		} else {
			url = getExcelSheet(0).getRow(1).getCell(4).getStringCellValue();
		}
		System.out.println("======" + url + "=========");
		return url;

	}

	public static void writeExcelData(int sheetNo, int rowNo ,int columnNo, String value)

	{
		String dataFilePath = "Resource/DataConfiguration.xlsx";
		File datafile = new File(dataFilePath);
		String fullpath = datafile.getAbsolutePath();
		XSSFSheet firstSheet = null;
		try {

			FileInputStream inputStream = new FileInputStream(
					new File(fullpath));

			XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
			firstSheet = workbook.getSheetAt(sheetNo);

			firstSheet.createRow(getlastRowcount(sheetNo) + 1)
					.createCell(columnNo).setCellValue(value);

			FileOutputStream fos = new FileOutputStream(new File(fullpath));
			workbook.write(fos);

			workbook.close();
			inputStream.close();

		} catch (Exception e) {
			System.out.println(e);
		}

		/*
		 * getExcelSheet(sheetNo).createRow(getlastRowcount(1) + 10)
		 * .createCell(1).setCellValue(value"hello");
		 */

	}

	public static int getlastRowcount(int sheetNo) {

		return getExcelSheet(sheetNo).getLastRowNum();
	}

	static Random randm = new Random();

	public static int rndmday() {
		int day = randm.nextInt(28 - 10) + 10;
		return day;
	}

	public static String rndmmonth() {

		ArrayList<String> month = new ArrayList<String>();

		month.add("Jan");
		month.add("Feb");
		month.add("Mar");
		month.add("Apr");
		month.add("May");
		month.add("Jun");
		month.add("Jul");
		month.add("Aug");
		month.add("Sep");
		month.add("Oct");
		month.add("Nov");
		month.add("Dec");

		int i = randm.nextInt(month.size());
		String month1 = month.get(i);
		return month1;
	}

	 public static String bday = rndBDY();
	 public static String joining_confrm_Date = rndJoining();
	 public static String pan = rndmPAN();
	 public static String fname = firstname();
	 public static String mname = middlename();
	 public static String lastname = lastname();
	 public static String fathername = fathername();
	 
	 /*For attendance mode options 1.Biometric
	 							 2.Manager Marking
	 							 3.PunchIN
	 							 4.Mobile
	 							 5.Swipecards*/
	 public static String attendance_mode1 = "Biometric";
	 public static String attendance_mode2 =  "PunchIN";
	 public static String attendance_mode3 =  "Manager Marking";

	 /*For attendance mode options 
	  *  1.Weekly off
		 2.Regular Shift
		 3.Saturday Shift
		 4.General
		 5.*/
	 public static String shift_type =  "General";

	
	public static int rndmyear() {
		int start = 1970;
		int end = 1997;
		int day = randm.nextInt(end - start) + start;
		return day;
	}

	public static String rndBDY() {
		String final_bday = new StringBuilder(20).append(rndmday())
				.append(rndmmonth()).append(rndmyear()).toString();

		return final_bday;
	}

	public static String rndJoining() {
		String final_bday = new StringBuilder(20).append(rndmday())
				.append(rndmmonth()).append("2014").toString();

		return final_bday;
	}

	public static int rndm3no() {
		int numNoRange = randm.nextInt(9999);
		return numNoRange;

	}

	public static String rndmPAN() {
		String PAN_no = new StringBuilder(10).append(rndmString(3))
				.append("PP").append(rndm3no()).append(rndmString(1))
				.toString();
		return PAN_no;
	}

	 public static String firstname() {
			String firstname = new StringBuilder(10).append("Test").append(rndmString2(3)).toString();
			return firstname;
		}
	

	 public static String middlename() {
			String middlename = new StringBuilder(10).append("Kiwi").append(rndmString2(3)).toString();
			return middlename;
		}
	 
	 public static String lastname() {
			String lastname = new StringBuilder(10).append("Qa").append(rndmString2(3)).toString();
			return lastname;
		}
	 
	 public static String fathername() {
			String fathername = new StringBuilder(10).append("KiwQA").append(rndmString2(3)).toString();
			return fathername;
		}
	
}

	

