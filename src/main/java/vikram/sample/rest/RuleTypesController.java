package vikram.sample.rest;

import java.util.ArrayList;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //TODO REVIEW there's a difference between @Controller and @RestController, please use @RestController instead
public class RuleTypesController {

  @GetMapping(value="/admin2/getRuleTypes")
  public ResponseEntity<JqGridData<RuleTypeVO>> /*ModelAndView*/ getRuleTypes() {
    return ResponseEntity.badRequest().build();

  }
  private static class JqGridData<T> extends ArrayList<T> {

  }
  private static class RuleTypeVO {

  }
}
