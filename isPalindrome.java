      //isPalindrome
      int number = 35753; //it can be any number

        List<Integer> array = new ArrayList<Integer>();
        int y = 10;
        while (y < number) {
            array.add(number % y);
            number = number / y;
        }
        
        array.add(number);
        for( int i = 0 ; i <array.size()-1;i++)
        {
            if(i == array.size()-1-i)
                break;
            else
            {
                if(array.get(i) ==  array.get(array.size()-1-i))
                    continue;
                else
                    return false;
            }
        }
        return true;
