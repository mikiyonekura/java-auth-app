package com.example.catalog.bean;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    //ユーザーID
    private int userId;
    private String name;
    //生年月日
    private String birthday;
    private String email;
    private String password;
    //所属
    private Affiliation affiliationId;
    //権限
    private String authority;
    //登録日時
    private LocalDateTime insDt;
    //更新日時
    private LocalDateTime updDt;

    //lombokを使うと、下記のようなボイラープレートやコンストラクタを作らなくても、コンパイル時に自動生成してくれる

    //ボイラープレート
    // public void setUserName(String name) {
    //     this.name = name;
    // }
    // public String getUserName() {
    //     return this.name;
    // }

    //コンストラクタ
    // public User(int userId, String name, String email, String password, String authority, LocalDateTime insDt, LocalDateTime updDt) {
    //     this.userId = userId;
    //     this.name = name;
    //     this.email = email;
    //     this.password = password;
    //     this.authority = authority;
    //     this.insDt = insDt;
    //     this.updDt = updDt;
    // }
}
