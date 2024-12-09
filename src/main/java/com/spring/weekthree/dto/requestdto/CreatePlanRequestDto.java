package com.spring.weekthree.dto.requestdto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * 도전 과제 C 완료
 * 도전 과제 R 전체 조회 완료
 * 도전 과제 R 단건 조회 리팩토링 완료
 *
 *
 */

@NoArgsConstructor
@Getter
public class CreatePlanRequestDto {
    // 속성
    private Long memberId;
    // 멤버 아이디
    private String password;
    private LocalDate plannedDate;
    private String title;
    private String task;

    // 생성자

    // 기능
}