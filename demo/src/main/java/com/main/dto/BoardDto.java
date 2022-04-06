package com.main.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardDto {
	
	/* 글 번호 */
	private int num;
	
	/* 제목 */
	private String title;
	
	/* 내용 */
	private String content;
	
	/* 글 암호 */
	private String password;

	/* 작성자 */
	private String writer;
	
	/* 작성일자 */
	private String writeDate;
	
	/* 사용여부 */
	private String useYn;
}
