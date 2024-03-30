class Cal extends ExtendCal {

    float addition(float operand1, float operand2) {
        return (operand1 + operand2);
    }

    float subsraction(float operand1, float operand2) {
        return (operand1 - operand2);
    }

    float multiplication(float operand1, float operand2) {
        return (operand1 * operand2);
    }

    float division(float operand1, float operand2) {
        return (operand1 / operand2);
    }

    public static void main(String[] args) {
        float operand1 = 10;
        float operand2 = 10;
        Cal c = new Cal();
        float a_result = c.addition(operand1, operand2);
        System.out.println(a_result);
        float b_result = c.subsraction(operand1, operand2);
        System.out.println(b_result);
        float c_result = c.multiplication(operand1, operand2);
        System.out.println(c_result);
        float d_result = c.division(operand1, operand2);
        System.out.println(d_result);
        float e_result = c.square(operand1);
        System.out.println(e_result);
        float f_result = c.cube(operand1);
        System.out.println(f_result);
    }
}
