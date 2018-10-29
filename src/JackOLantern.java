public class JackOLantern extends java.lang.Object {
    // Field; 2D array
    String[][] faceFeatures;

    // Constructor
    public JackOLantern(java.lang.String[][] faceFeatures) {
        this.faceFeatures = faceFeatures;
    }

    // Methods
    // Edits one of the strings in the faceFeatures array
    public void edit(java.lang.String replace, int row, int column) {
        faceFeatures[row][column] = replace;
    }

    // fills the faceFeatures array with a single string...... whatever that means
    public void fill(java.lang.String str) {

    }

    // Prints out the face row by row
    public java.lang.String toString() {
        String out = "";
        for (int i = 0; i < faceFeatures.length; i ++) {
            for (int x = 0; x < faceFeatures[i].length; x ++) {
                if (x == faceFeatures.length - 1 && x == faceFeatures.length - 1) {
                    out += faceFeatures[i][x];
                }
                else {
                    out += faceFeatures[i][x] + "\n";
                }
            }
        }
        return out;
    }

}
