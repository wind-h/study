package com.wind.study.datastructure;

public class Calculator {
    //计算器中操作符的优先级 , 数字越大，优先级越高
    public int priority(char oper) {
        if (oper == '*' || oper == '/') {
            return 1;
        } else if (oper == '+' || oper == '/') {
            return 0;
        } else {
            return -1;
        }
    }

    //判断是否是一个操作符
    public boolean isOper(char oper) {
        return oper == '+' || oper == '-' || oper == '*' || oper == '/';
    }

    //计算
    public int cal(int num1, int num2, char oper) {
        int result = 0;
        switch (oper) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num2 - num1;//例如5-2 出栈时2先出为num1,5后出为num2
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num2 / num1;
                break;
            default:
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        //表达式
        String expression = "200+60*2-20";

        Calculator c = new Calculator();
        Stack numStack = new Stack(10);
        Stack operStack = new Stack(10);
        //定义相关变量
        int index = 0;//用于扫描表达式
        int num1 = 0;
        int num2 = 0;
        char oper = 0;
        int result = 0;//结果
        char temp = ' ';
        //循环扫描
        while (true) {
            temp = expression.charAt(index);
            if (c.isOper(temp)) {//如果temp是操作符
                if (operStack.isEmpty()) {//如果操作符栈为空，直接入栈
                    operStack.push(temp);
                } else {
                    //如果不为空,就进行比较，如果当前操作符的优先级小于等于栈中的操作符的优先级，
                    // 就需要从数栈中pop()两个数，将操作符栈中操作符pop()出进行计算
                    if (c.priority(temp) <= c.priority((char) operStack.peek())) {
                        num1 = (int) numStack.pop();
                        num2 = (int) numStack.pop();
                        oper = (char) operStack.pop();
                        result = c.cal(num1, num2, oper);
                        numStack.push(result);
                        operStack.push(temp);
                    } else {
                        operStack.push(temp);
                    }
                }
            } else {//如果是数字，入数栈
                //处理多位数时,判断此数后面是否还是数字
                int tempIndex = index;
                while (true) {//将数字的范围求出来
                    if (tempIndex == expression.length()) {
                        break;
                    }
                    if (c.isOper(expression.charAt(tempIndex))) {
                        break;
                    }
                    tempIndex++;
                }
                //得到这个范围的数字字符串
                String tempNum = expression.substring(index, tempIndex);
                //转换成数字后入栈
                numStack.push(Integer.valueOf(tempNum));
                index = tempIndex - 1;
            }
            //扫描下一个
            index++;
            //判断index 是否超出长度
            if (index >= expression.length()) {
                break;
            }
        }
        //扫描完毕
        while (true) {
            //如果没有操作符了，就说明数栈里只有一个数了
            if (operStack.isEmpty()) {
                break;
            }

            num1 = (int) numStack.pop();
            num2 = (int) numStack.pop();
            oper = (char) operStack.pop();
            result = c.cal(num1, num2, oper);
            numStack.push(result);
        }
        System.out.println("result = " + numStack.pop());
    }
}
