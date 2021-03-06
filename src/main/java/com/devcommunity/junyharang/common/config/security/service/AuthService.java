package com.devcommunity.junyharang.common.config.security.service;

import com.devcommunity.junyharang.common.config.security.dto.request.SignInRequestDTO;
import com.devcommunity.junyharang.common.config.security.dto.response.SignInResponseDTO;
import com.devcommunity.junyharang.common.constant.DefaultResponse;

import javax.servlet.http.HttpServletRequest;

/**
 * 회원 인증 관련 비즈니스 로직 담당 Interface
 * <pre>
 * <b>History:</b>
 *    주니하랑, 1.0.0, 2022.03.30 최초 작성
 *    주니하랑, 1.1.0, 2022.03.31 JWT(Access Token, Refresh Token) 기반 로그인 기능 재 구성
 *    주니하랑, 1.1.1, 2022.03.31 Access Token 재 발급 기능 구현 완료
 * </pre>
 *
 * @author 주니하랑
 * @version 1.1.1, 2022.03.31 Access Token 재 발급 기능 구현 완료
 * @See ""
 * @see <a href=""></a>
 */

public interface AuthService {

    /**
     * Login 관련 Method
     * @param signInRequestDTO - 로그인 요청 이용자 ID와 Password가 들어 있는 객체
     * @return DefaultResponse<SignInResponseDTO> - Http Status 관련 응답과 로그인 시 반환될 내용을 가진 객체
     * @see ""
     */

    DefaultResponse<SignInResponseDTO> signIn(SignInRequestDTO signInRequestDTO);

    /**
     * JWT 재 발급 관련 Method
     * @param request - JWT 요청 이용자가 재발급을 위해 제출한 요청 객체
     * @return DefaultResponse - Http Status Code 관련 반환 객체
     * @see ""
     */

    DefaultResponse jwtReissue(HttpServletRequest request);

    /**
     * Logout Method
     * @param request - Logout 요청 이용자가 Logout을 위해 제출한 요청 객체
     * @return DefaultResponse - Http Status Code 관련 반환 객체
     * @see ""
     */

    DefaultResponse logout(HttpServletRequest request);
} // interface 끝
