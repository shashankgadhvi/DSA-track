class Solution {
    public int evalRPN(String[] tokens) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int first=0,second=0,result=0;
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("/") || tokens[i].equals("*")){
                first = stack.pop();
                second = stack.pop();
                switch(tokens[i]){
                    case "+" : result = second + first;
                    break;
                    case "-" : result = second - first;
                    break;
                    case "/" : result = second/first;
                    break;
                    case "*" : result = second*first;
                    break; 
                }
                stack.push(result);
            }
            else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
    if(stack.isEmpty()){
        return result;
    }
    else{
        return stack.pop();
    }
    }
}