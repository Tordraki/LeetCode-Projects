public class insert {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<int[]>();
        int i = 0;
        if(intervals.length == 0){
            return new int[][]{{newInterval[0], newInterval[1]}};
        }
        while(i<intervals.length && intervals[i][0] <= newInterval[0]){
            list.add(new int[]{intervals[i][0], intervals[i][1]});
            i++;
        }
        if(i>0 && intervals[i-1][1] >= newInterval[0]){
            list.get(i-1)[1] = Math.max(newInterval[1], intervals[i-1][1]);
            i--;
        }
        else{
            list.add(new int[]{newInterval[0], newInterval[1]});
        }

        while(i<intervals.length){
            if(intervals[i][0] <= newInterval[1]){
                list.get(list.size()-1)[1] = Math.max(list.get(list.size()-1)[1], intervals[i][1]);
            }
            else{
                list.add(new int[]{intervals[i][0], intervals[i][1]});
            }
            i++;
        }
        int[][] result = new int[list.size()][2];
        for(int j = 0; j < list.size(); j++){
            for(int a = 0; a < 2; a++){
                result[j][a] = list.get(j)[a];
            }
        }
        return result;


    }
}
