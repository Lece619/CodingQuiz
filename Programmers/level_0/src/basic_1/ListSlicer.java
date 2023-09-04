package basic_1;

import java.util.ArrayList;
import java.util.Arrays;

public class ListSlicer {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        return Slicer.makeSlicer(n, slicer).slice(num_list);
    }

    static class Slicer {
        int start;
        int end;
        int term = 1;

        public static Slicer makeSlicer(int n, int[] slicer){
            return switch (n) {
                case 1 -> new Slicer_1(slicer);
                case 2 -> new Slicer_2(slicer);
                case 3 -> new Slicer_3(slicer);
                case 4 -> new Slicer_4(slicer);
                default -> throw new IllegalArgumentException("Unexpected value: " + slicer.length);
            };
        }

        public int[] slice(int[] num_list){
            return Arrays.copyOfRange(num_list, Math.max(this.start, 0), Math.min(this.end + 1, num_list.length));
        }
    }


    static class Slicer_1 extends Slicer {
        public Slicer_1(int[] slicer){
            this.start = 0;
            this.end = slicer[1];
        }
    }

    static class Slicer_2 extends Slicer {
        public Slicer_2(int[] slicer){
            this.start = slicer[0];
            this.end = 29;
        }
    }

    static class Slicer_3 extends Slicer {
        public Slicer_3(int[] slicer){
            this.start = slicer[0];
            this.end = slicer[1];
        }
    }

    static class Slicer_4 extends Slicer {
        public Slicer_4(int[] slicer){
            this.start = slicer[0];
            this.end = slicer[1];
            this.term = slicer[2];
        }

        @Override
        public int[] slice(int[] num_list) {
            ArrayList<Integer> sliced_list = new ArrayList<>();
            for(int i = this.start; i <= this.end; i += this.term){
                sliced_list.add(num_list[i]);
            }
            return sliced_list.stream().mapToInt(i -> i).toArray();
        }
    }
}
