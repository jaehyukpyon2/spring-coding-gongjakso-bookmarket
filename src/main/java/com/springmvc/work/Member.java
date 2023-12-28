package com.springmvc.work;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class Member {

    @NotBlank(message = "아이디를 입력해주세요")
    private String userid;

    @NotBlank(message = "이름을 입력해주세요")
    private String username;

    @NotNull(message = "나이를 입력해주세요")
    @Min(value = 0, message = "나이는 0세 이상이어야 합니다")
    @Max(value = 150, message = "나이는 150세 이하여야 합니다")
    private Integer age;

    @NotBlank(message = "이메일을 입력해주세요")
    @Email(message = "이메일 형식으로 입력해주세요")
    private String email;
}
