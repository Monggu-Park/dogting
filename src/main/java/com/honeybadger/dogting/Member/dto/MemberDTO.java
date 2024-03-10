package com.honeybadger.dogting.Member.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString

public class MemberDTO {
    private Long id;
    private String memberEmail;
    private String memberPassword;
    private String memberName;
}
