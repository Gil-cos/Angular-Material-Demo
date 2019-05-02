import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { OwnerCreateComponent } from './owner-create/owner-create.component';
import { AccountDataComponent } from './owner-details/account-data/account-data.component';
import { OwnerDataComponent } from './owner-details/owner-data/owner-data.component';
import { OwnerDetailsComponent } from './owner-details/owner-details.component';
import { OwnerListComponent } from './owner-list/owner-list.component';
import { OwnerRoutingModule } from './owner-routing/owner-routing.module';
import { SharedModule } from '../shared/shared.module';

@NgModule({
  declarations: [
    OwnerListComponent,
    OwnerDetailsComponent,
    OwnerDataComponent,
    AccountDataComponent,
    OwnerCreateComponent
  ],
  imports: [
    CommonModule,
    OwnerRoutingModule,
    ReactiveFormsModule,
    SharedModule
  ]
})
export class OwnerModule { }
