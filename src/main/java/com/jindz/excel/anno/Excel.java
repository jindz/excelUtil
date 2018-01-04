package com.jindz.excel.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Excel定义
 * @author jinezhi
 * @date 2015-9-22 15:34:29
 **/
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Excel {
	public static final int time = 0;
	public static final int calendar = 1;
	public static final int number = 2;
	public static final int string = 3;
	
	public static final String HH_MM = "HH:mm";
	
	public static final String YYYY_MM_DD = "yyyy-MM-dd";

	public static final short defaultBackgroundColor = 9999;

	/**
	 * 下标
	 * @return
	 */
	int index();

	/**
	 * 列名
	 * @return
	 */
	String title() default "";
	/**
	 * 内容的类型
	 * @return
	 */
	int textType() default string;
	/**
	 * 如果列内容为时间，那么将按照此格式进行格式化
	 * @return
	 */
	String timeFormat() default HH_MM;
	/**
	 * 如果列内容为日期，那么将按照此格式进行格式化
	 * @return
	 */
	String CalendarFormat() default YYYY_MM_DD;
	/**
	 * 边框设置
	 * @return
	 */
	short border() default Border.BORDER_THIN;
	/**
	 * 背景色设置
	 * @return
	 */
	short backgroundColor() default defaultBackgroundColor;
}