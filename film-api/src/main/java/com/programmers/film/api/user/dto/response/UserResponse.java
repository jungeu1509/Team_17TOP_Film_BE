package com.programmers.film.api.user.dto.response;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class UserResponse {

	private final String nickname;

	private final String profileImageUrl;
}
