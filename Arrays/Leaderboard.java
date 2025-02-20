//16)Leaderboard array
//i/p: 16,17,4,3,5,2
//o/p: 17,5,2
ArrayList<Integer> output = new ArrayList<>();
    int max = array[array.length - 1];
    output.add(max);

    for (int i = array.length - 2; i >= 0; i--) {
        if (array[i] > max) {
            max = array[i];
            output.add(max);
        }
    }

    int[] out = new int[output.size()];
    int j = 0;
    for (int i = output.size() - 1; i >= 0; i--) {
        out[j++] = output.get(i);
    }
    return out;
