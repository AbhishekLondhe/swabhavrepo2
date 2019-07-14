import { Routes } from '@angular/router';
import { WelcomeComponent } from './welcome/welcome.component';
import { ProductListComponent } from './product_list/product_list.component';
import { ProductDetailsComponent } from './product_details/product_details.component';

export const routes:Routes=[{path:'welcome',component:WelcomeComponent},
{path:'product_list',component:ProductListComponent},
{path:'product_details/:id',component:ProductDetailsComponent}]