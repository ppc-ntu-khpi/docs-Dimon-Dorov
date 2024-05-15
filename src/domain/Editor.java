package domain;
public class Editor extends Artist {
    /**
     * 
     * @param electronicEditing The electronic editing.
     * @param skiils The skiils.
     * @param name The name.
     * @param jobTitle The jobTitle.
     * @param level The level.
     * @param dept The dept.
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }
    /**
     * Constructs an Editor object with the specified electronic editing preference.
     * @param electronicEditing The electronic editing.
     * @param skiils The skiils.
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }
    /**
     *  Constructs an Editor object with the specified electronic editing preference.
     * @param electronicEditing The electronic editing.
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    /**
     * Constructs an Editor object with default values.
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }
    /**
     * Returns a string representation object.
     * @return A string containing information and preference.
     */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    private boolean electronicEditing;
    /**
     * Retrieves the editing preference.
     * @return The editing preference.
     */
    public boolean getPreferences() {
        return electronicEditing;
    }
    /**
     * Sets the editing preference.
     * @param electronic The editing preference to set.
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}
