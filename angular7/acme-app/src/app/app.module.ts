import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { ProductListComponent } from './product_list/product_list.component';
import { ProductDetailsComponent } from './product_details/product_details.component';
import { RatingComponent } from './star_rating/star_rating.component';
import { FilterPipe } from './search_pipe/searchFilter';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { productService } from 'src/service/productService';

@NgModule({
  declarations: [
    AppComponent,
    WelcomeComponent,
    ProductListComponent,
    ProductDetailsComponent,
    RatingComponent,
    FilterPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [productService],
  bootstrap: [AppComponent]
})
export class AppModule { }
