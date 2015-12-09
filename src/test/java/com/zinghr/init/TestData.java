package com.zinghr.init;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestData {

	public static String company_code = getCompanycodeFromExcel();
	public static String employe_code = getEmployeeCodeFromExcel();
	public static String password = getPasswordFromExcel();

	public static String company_code_dl = "KIWIQA123";
	public static String employe_code_dl = "Admin123";
	public static String password_dl = "Admin@1234";
	/*
	 * public static String intime = "12:00"; public static String outtime =
	 * "18:00";
	 */

	public static String shift_name = "abcd123";
	/*
	 * public static String intime = "08:30"; public static String outtime =
	 * "17:30";
	 */

	public static String company_code_se = "CYOLTEST";
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

	public static String blank = " ";
	public static String invalid = "%&^%6545as";

	public static String rndmString(int length) {
		String rnd1 = RandomStringUtils.randomAlphabetic(length);
		return rnd1;

	}

	public static int rndmNumber(int length) {

		Random randm = new Random();
		int numNoRange = randm.nextInt(999999);
		return numNoRange;

	}

	public static String alphanum(int i) {
		String alphanumeric = new StringBuilder(7).append("Test")
				.append(rndmNumber(2)).toString();
		return alphanumeric;
	}

	public static String rndmemail(int i) {
		String email = new StringBuilder(30).append("testkiwi")
				.append(rndmNumber(i)).append(rndmString(2))
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

	public static Sheet getExcelSheet() {
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
			firstSheet = workbook.getSheetAt(0);

			workbook.close();
			inputStream.close();

		} catch (Exception e) {

		}
		return firstSheet;
	}

	public static String getCompanycodeFromExcel() {

		return getExcelSheet().getRow(1).getCell(0).getStringCellValue();
	}

	public static String getEmployeeCodeFromExcel() {
		return getExcelSheet().getRow(1).getCell(1).getStringCellValue();

	}

	public static String getPasswordFromExcel() {
		return getExcelSheet().getRow(1).getCell(2).getStringCellValue();

	}

}
