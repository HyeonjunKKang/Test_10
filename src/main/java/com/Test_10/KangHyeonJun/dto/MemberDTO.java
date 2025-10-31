package com.Test_10.KangHyeonJun.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class MemberDTO {
    @NotEmpty(message = "올바른 형식의 이메일 주소여야 합니다")
    @Email(message = "올바른 형식의 이메일 주소여야 합니다")
    public String email;
    @NotEmpty(message = "비밀번호는 필수 항목입니다")
    public String password;
    @NotEmpty(message = "이름는 필수 항목입니다")
    public String name;
}
