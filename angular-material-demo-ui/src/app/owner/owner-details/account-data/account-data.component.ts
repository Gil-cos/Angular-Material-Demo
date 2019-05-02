import { Component, OnInit, Input } from '@angular/core';
import { Owner } from 'src/app/model/owner.model';
import { RepositoryService } from 'src/app/shared/repository.service';

@Component({
  selector: 'app-account-data',
  templateUrl: './account-data.component.html',
  styleUrls: ['./account-data.component.css']
})
export class AccountDataComponent implements OnInit {

  @Input() public owner: Owner;

  accounts: Account[];

  constructor(
    private repositoryService: RepositoryService
  ) { }

  ngOnInit() {
    this.repositoryService.getAccountData(`api/account/${this.owner.id}`)
      .subscribe(resp => this.accounts = resp as Account[]);
  }

}
