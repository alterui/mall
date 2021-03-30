package com.lr.lambda;

/**
 * @author liurui
 * @date 2021/3/27 10:05
 */
public class UserAgeFilter implements MyComparator<User> {

    public Boolean comparator(User user) {
        return user.getAge() >= 35;
    }
}
