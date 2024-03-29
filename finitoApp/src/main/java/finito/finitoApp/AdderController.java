package finito.finitoApp;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/adder", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AdderController {

    private AdderService adderService;

    public AdderController(AdderService adderService) {
        this.adderService = adderService;
    }
    @GetMapping("/current")
    public int currentNum() {
        return adderService.currentBase();
    }

    @PostMapping("/add")
    public int add(@RequestParam int num) {
        return adderService.add(num);
    }

    @PostMapping("accumulate")
    public int accumulate(@RequestParam int num) {
        return adderService.accumulate(num);
    }
}