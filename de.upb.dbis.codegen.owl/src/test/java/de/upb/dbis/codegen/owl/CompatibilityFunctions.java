package de.upb.dbis.codegen.owl;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class CompatibilityFunctions {

	@Test
	public void test() {

		boolean boolean_ = true;
		byte byte_ = 1;
		int integer_ = 1;
		long long_ = 1L;
		float float_ = 1f;
		double double_ = 1d;
		String string_ = "1";
		Date date_ = new Date();
	}
	
	public static byte boolean2byte(boolean b) {
		return b ? (byte)1 : (byte) 0;
	}
	public static int boolean2integer(boolean b) {
		return b ? 1 : 0;
	}
	public static long boolean2long(boolean b) {
		return b ? 1L : 0L;
	}
	public static float boolean2float(boolean b) {
		return b ? 1f : 0f;
	}
	public static double boolean2double(boolean b) {
		return b ? 1d : 0d;
	}
	public static String boolean2string(boolean b) {
		return b ? "true" : "false";
	}
	public static boolean byte2boolean(byte b) {
		return b>0 ? true : false;
	}

	public static int byte2int(byte b) {
		return (int) b;
	}
	public static long byte2long(byte b) {
		return (long) b;
	}
	public static float byte2float(byte b) {
		return (float) b;
	}
	public static double byte2double(byte b) {
		return (double) b;
	}
	public static String byte2string(byte b) {
		return b+"";
	}
	public static Date byte2date(byte b) {
		return new Date(b);
	}
	public static boolean int2boolean(int b) {
		return b>0 ? true : false;
	}
	public static byte int2byte(int b) {
		return (byte) b;
	}
	public static long int2long(int b) {
		return (long) b;
	}
	public static float int2float(int b) {
		return (float) b;
	}
	public static double int2double(int b) {
		return (double) b;
	}
	public static String int2string(int b) {
		return b+"";
	}
	public static Date int2date(int b) {
		return new Date(b);
	}
	public static boolean long2boolean(long b) {
		return b>0 ? true : false;
	}
	public static byte long2byte(long b) {
		return (byte) b;
	}
	public static int long2int(long b) {
		return (int) b;
	}
	public static float long2float(long b) {
		return (float)b;
	}
	public static double long2double(long b) {
		return (double)b;
	}
	public static String long2string(long b) {
		return b+"";
	}
	public static Date long2date(long b) {
		return new Date(b);
	}
	public static boolean float2boolean(float b) {
		return b>0? true : false;
	}
	public static byte float2byte(float b) {
		return (byte) b;
	}
	public static int float2int(float b) {
		return (int) b;
	}
	public static long float2long(float b) {
		return (long) b;
	}

	public static double float2double(float b) {
		return (double) b;
	}
	public static String float2string(float b) {
		return b+"";
	}
	public static Date float2date(float b) {
		return new Date((long)b);
	}
	public static boolean double2boolean(double b) {
		return b>0 ? true : false;
	}
	public static byte double2byte(double b) {
		return (byte) b;
	}
	public static int double2int(double b) {
		return (int)b;
	}
	public static long double2long(double b) {
		return (long) b;
	}
	public static float double2float(double b) {
		return (float) b;
	}

	public static String double2string(double b) {
		return b+"";
	}
	public static Date double2date(double b) {
		return new Date((long) b);
	}
	public static boolean string2boolean(String b) {
		return b.equals("true")? true: false;
	}
	public static byte string2byte(String b) {
		return Byte.parseByte(b);
	}
	public static int string2int(String b) {
		return Integer.parseInt(b);
	}
	public static long string2long(String b) {
		return Long.parseLong(b);
	}
	public static float string2float(String b) {
		return Float.parseFloat(b);
	}
	public static double string2double(String b) {
		return Double.parseDouble(b);
	}

	public static Date string2date(String b) {
		try {
			return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").parse(b);//2001-07-04T12:08:56.235-0700
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Date();
		}
	}
	public static boolean date2boolean(Date b) {
		return false;
	}
	public static byte date2byte(Date b) {
		return (byte) b.getTime();
	}
	public static int date2int(Date b) {
		return (int) b.getTime();
	}
	public static long date2long(Date b) {
		return (long) b.getTime();
	}
	public static float date2float(Date b) {
		return (float) b.getTime();
	}
	public static double date2double(Date b) {
		return (double) b.getTime();
	}
	public static String date2string(Date b) {
		return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(b);
	}


}
