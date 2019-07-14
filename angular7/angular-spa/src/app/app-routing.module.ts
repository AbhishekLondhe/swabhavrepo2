import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { route } from './RouteConfig';


@NgModule({
  imports: [RouterModule.forRoot(route,{useHash:true})],
  exports: [RouterModule]
})
export class AppRoutingModule { }
