package org.lanqiao.pojo;

import lombok.*;

/**
 * @Auther: WDS
 * @Date: 2018/12/21 18:02
 * @Description:
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class User {
    private int id;
    private String username;
    private String sex;
    private int age;
    private String email;
}
