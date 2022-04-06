package com.main.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserDto {
	
	/* 아이디 */
	private String userId;
	
	/* 비밀번호 */
	private String userPw;
	
	/* 이름 */
	private String userName;
	
	/* 성별 */
	private String userGender;
	
	/* 이메일 */
	private String userEmail;
	
	/* 사용여부 */
	private String useYn;
}
