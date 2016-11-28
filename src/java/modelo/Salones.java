
package modelo;
public class Salones {
    private String name;
    private String block;
    private String type;
    private String beam;
    private String comment;

    public Salones( String name, String block, String type, String beam, String comment) {
        this.name = name;
        this.block = block;
        this.type = type;
        this.beam = beam;
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBeam() {
        return beam;
    }

    public void setBeam(String beam) {
        this.beam = beam;
    }
    
    
    
}
