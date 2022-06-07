package model.topic;

import lombok.*;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public abstract class Attachment {
    @NonNull
    private String title;
    private Topic topic;
}
