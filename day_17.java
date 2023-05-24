class Solution {
    public int smallestEvenMultiple(int n) {
        if(n%2!=0)
        {
        int answ=n*2;
        return answ;
        }
        return n;
    }
}


class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahreheit = celsius*1.80 + 32;
        double arr[] = {kelvin,fahreheit};
        return arr;
    }
}



class Solution {
    public int sumOfMultiples(int n) {
        int sum=0;
        for(int i=1; i<=n; i++)
        {
            if(i%3==0||i%5==0||i%7==0)
            {
                sum=sum+i;
            }
        }
        return sum;
    }
}






class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int ans=arrivalTime+delayedTime;
        if(ans==24)
        {
            return 0;
        }
        if(ans>24)
        {
            ans=ans-24;
        }
        return ans;
    }
}




lass Solution {
    public int maximumCount(int[] nums) {
        
         
        int Positive_Count = 0;
        int Negative_Count = 0;

        for (int i = 0; i < nums.length ; i++) {
            
            
            if (nums[i] < 0) {

                Negative_Count += 1;

            } else if (nums[i] > 0){  

                Positive_Count += 1;
            }
        }

        
        int ans = Math.max (Negative_Count , Positive_Count);

        return ans;
    }
}



class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        
        // Typecasting to long
        long volume = (long)length*width*height;
        
        // True if any of the dimensions are greater than or equal to 10000
        // Or volume is greater than or equal to 10^9
        boolean bulky = (length >= 1e4 || width >= 1e4 || height >= 1e4 || volume >= 1e9) ? true : false;
        
        boolean heavy = mass >= 100 ? true : false;
        
        if (bulky && heavy) return "Both";
        if (bulky) return "Bulky";
        if (heavy) return "Heavy";
        return "Neither";
    }
}
