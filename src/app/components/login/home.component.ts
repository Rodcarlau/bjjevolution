import { Component, OnInit } from '@angular/core';
import { UsuarioService } from './usuario.service';

@Component({
  selector: 'app-home',
  template: `
    <div *ngIf="usuario">
      <h2>Bem-vindo {{ usuario.email }}</h2>
      <p>{{ usuario.msg }}</p>
    </div>
  `
})
export class HomeComponent implements OnInit {
  usuario: any;

  constructor(private usuarioService: UsuarioService) {}

  ngOnInit(): void {
    this.usuarioService.getUsuario().subscribe(data => {
      this.usuario = data;
    });
  }
}