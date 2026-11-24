class Solution {
    public String validIPAddress(String queryIP) {
      
      if(queryIP.contains(".")){
         return isValidIpv4(queryIP)? "IPv4":"Neither";
      }
       if(queryIP.contains(":")){
         return isValidIpv6(queryIP)? "IPv6":"Neither";
      }
        return "Neither";
    }

    public boolean isValidIpv4(String ip){
        String[] parts= ip.split("\\.",-1);
        if(parts.length!=4){
            return false;
        }

        for(String part:parts){
            if(part.length()==0 || part.length()>3){
                return false;
            }
            if(part.length()>1 && part.charAt(0)=='0'){
                return false;
            }
            for(char ch: part.toCharArray()){
                if(!Character.isDigit(ch)){
                    return false;
                }
            }
            int num= Integer.parseInt(part);
            if(num<0 || num>255){
                return false;
            }
        }
        return true;
    }
    public boolean isValidIpv6(String ip){
        String[] parts= ip.split("\\:",-1);
        if(parts.length!=8){
            return false;
        }

        for(String part:parts){
           if(part.length()==0 || part.length()>4){
              return false;
           }
           for(char ch: part.toCharArray()){
            boolean isDigit = (ch>='0' && ch<='9');
            boolean isLowerHex = (ch >= 'a' && ch <= 'f');
            boolean isUpperHex = (ch >= 'A' && ch <= 'F');
                if (!isDigit && !isLowerHex && !isUpperHex) {
                    return false;
                }
           }
        }
        return true;
    }
}