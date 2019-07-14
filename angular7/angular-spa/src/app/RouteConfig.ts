import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { CareerComponent } from './career/career.component';
import { CareerWithParamsComponent } from './careerwithparams/careerwithparams.component';
import { NotFoundComponent } from './notfound/notfound.component';

export const route:Routes=[
    {path:'home', component:HomeComponent},
    {path:'about', component:AboutComponent},
    {path:'career', component:CareerComponent},
    {path:'careerwithparams/:id', component:CareerWithParamsComponent},
    {path:'', redirectTo:'/home',pathMatch:'full'}
    
]


