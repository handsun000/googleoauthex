package com.example.googleoauth.config.auth.dto;

import com.example.googleoauth.domain.user.User;
import lombok.Getter;

import java.io.Serializable;

/**
 * 세션에 저장하려면 직렬화를 해야 하는데
 * User 엔티티는 추후 변경사항이 있을 수 있기 때문에
 * 직렬화를 하기 위한 별도의 SessionUser 클래스 생성
 */
@Getter
public class SessionUser implements Serializable {      //User 엔티티 클래스에서 직렬화가 필요한 경우 별도로 사용

    private final String name;
    private final String email;
    private final String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}