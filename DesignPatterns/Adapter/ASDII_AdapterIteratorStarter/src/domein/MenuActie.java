package domein;

public class MenuActie {

    private int menuActieId;
    private String methodeNaam;
    private String menuItemNaam;
    private int nummerOuder;

    public MenuActie(String methodeNaam, String menuItemNaam,
            int nummerOuder, int nummerKind) {
        setMethodeNaam(methodeNaam);
        setMenuItemNaam(menuItemNaam);
        setOuder(nummerOuder);
        setMenuActieId(nummerKind);
    }

    public String getMethodeNaam() {
        return methodeNaam;
    }

    private void setMethodeNaam(String methodeNaam) {
        this.methodeNaam = methodeNaam;
    }

    public String getOmschrijving() {
        return menuItemNaam;
    }

    public String getMenuItemNaam() {
        return menuItemNaam;
    }

    private void setMenuItemNaam(String menuItemNaam) {
        this.menuItemNaam = menuItemNaam;
    }

    public int getOuder() {
        return nummerOuder;
    }

    private void setOuder(int nummerOuder) {
        this.nummerOuder = nummerOuder;
    }

    /**
     * @return the menuActieId
     */
    public int getMenuActieId() {
        return menuActieId;
    }

    /**
     * @param menuActieId the menuActieId to set
     */
    public void setMenuActieId(int menuActieId) {
        this.menuActieId = menuActieId;
    }
}
