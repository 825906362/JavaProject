package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SStudent {
    Integer studentId,age,cid;
    String studentName,className;
    CClass cClass;
}
