class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int t = i+1;
            if(t%3 == 0 && t%5 == 0)
                list.add("FizzBuzz");
            else if(t%3 == 0)
                list.add("Fizz");
            else if(t%5 == 0)
                list.add("Buzz");
            else
                list.add(Integer.toString(t));
        }
        return list;
    }
}