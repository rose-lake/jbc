# ArrayListInfo
## Compare Arrays with Array Lists


        ARRAYS                                 |    ARRAYLISTS
      -------------------------------------------------------------------------------------------------
      Declaration:                             |
         String[] colors = new String[3];      |   ArrayList<String> colors = new ArrayList<>();
      -------------------------------------------------------------------------------------------------
      Assigning values:                        |   Adding values:
         colors[0] = "blue";                   |      colors.add("blue");
      -------------------------------------------------------------------------------------------------
      Removing items:                          |
         You cannot delete items from arrays   |   colors.remove("blue") or colors.remove(0)
      -------------------------------------------------------------------------------------------------
      Getting the number of items:             |
         colors.length;                        |   colors.size();
      -------------------------------------------------------------------------------------------------
      Looping through and printing the values: | Enhanced for loop (can be used for arrays):
         for(int i=0; i<colors.length; i++) {  |   for(String s : colors) {
              System.out.println(colors[i]);   |       System.out.println(s);
         }                                     |   }
