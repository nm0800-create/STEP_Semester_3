package strings.class_problems;

public class FileExtensionValidator {
    
    public String validateFileExtension(String filename) {
        int dotIndex = filename.lastIndexOf('.');
        
        if (dotIndex == -1) {
            return "Rejected — invalid file type";
        }
        
        String extension = filename.substring(dotIndex + 1).toLowerCase();
        
        if (extension.equalsIgnoreCase("pdf") || extension.equalsIgnoreCase("docx") || 
            extension.equalsIgnoreCase("zip")) {
            return "Accepted";
        }
        
        return "Rejected — invalid file type";
    }
    
    public static void main(String[] args) {
        FileExtensionValidator validator = new FileExtensionValidator();
        
        System.out.println("=== File Extension Validator ===\n");
        
        System.out.println("Assignment1.PDF: " + validator.validateFileExtension("Assignment1.PDF"));
        System.out.println("notes.txt: " + validator.validateFileExtension("notes.txt"));
        System.out.println("report.docx: " + validator.validateFileExtension("report.docx"));
        System.out.println("archive.zip: " + validator.validateFileExtension("archive.zip"));
    }
}
