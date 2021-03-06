package com.br.template.constent;

/**
 *
 * @author xin.cao@100credit.com
 */
public enum ResultStatus {

    YES(1),
    NO(2);

    private int no;

    private ResultStatus(int no) {
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public static boolean isYES(int no) {
        for (ResultStatus rs : values()) {
            if (rs.getNo() == no) {
                return rs == YES;
            }
        }
        return false;
    }
}
