/** You’ll have to add the JavaDocs comments for the class here!*/
public class LightSequence
{
  // attributes not shown
  private String sequence;
  /** The parameter seq is the initial sequence used for
    * the light display */
  public LightSequence(String seq)
  {
    sequence = seq;
  }
  
  /** Inserts the string segment in the current sequence,
    * starting at the index ind. Returns the new sequence. */
  public String insertSegment(String segment, int ind)
  { 
    sequence = sequence.substring(0, ind+1) + segment + sequence.substring(ind);
    return sequence;
  }
  
  /** Updates the sequence to the value in seq*/
  public void changeSequence(String seq)
  {
    sequence = seq;
  }
  
  public String removeFirstOccurrence(String oldSeq, String segment){
    if(oldSeq.indexOf(segment) < 0){
      return oldSeq;
    }
    String newSeq;
    newSeq = oldSeq.substring(0, oldSeq.indexOf(segment))+ oldSeq.substring(oldSeq.indexOf(segment) + segment.length());
    return newSeq;
  }

  public double calculateLightDistance(int x1, int y1, int x2, int y2){
    double a = Math.abs(y2 - y1);
    double b = Math.abs(x2 - x1);
    double distance = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    return distance;
  }
  
  public void display()
  {
    System.out.println(sequence);
  }
} 