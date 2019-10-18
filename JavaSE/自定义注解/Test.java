package com.mid.admin.util;

public class Test {
    /**
     * 可以读取到类注解的属性value
     */
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = Class.forName("com.mid.admin.util.Ming");
        OfferShow offerShow = (OfferShow) clazz.getAnnotation(OfferShow.class);
        String com = offerShow.value();
        Ming ming = new Ming();
        ming.setName("xiehan");
        System.out.println(ming.getName() + " work at " + com + "!");
    }

}
