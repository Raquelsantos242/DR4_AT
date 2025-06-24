package infnet.selenium;

public enum InvoiceType {
    SIMPLE("Simple invoice", "Simple"),
    TAXED("Taxed invoice", "Taxed"),
    UNKNOWN("Unknown type", "Unknown");

    private final String noteDescription;
    private final String typeLabel;

    InvoiceType(String noteDescription, String typeLabel) {
        this.noteDescription = noteDescription;
        this.typeLabel = typeLabel;
    }

    public String getNoteDescription() {
        return noteDescription;
    }

    public String getTypeLabel() {
        return typeLabel;
    }
}
