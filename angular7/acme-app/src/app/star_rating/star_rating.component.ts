import { Component, Input} from '@angular/core'
@Component({
    selector: 'star-rating',
    templateUrl: './star_rating.component.html'
})
export class RatingComponent{
    @Input()
    rating:number;
}