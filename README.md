# 🚗 Sistema de Gestão de Frota de Veículos

Este projeto foi desenvolvido como parte da atividade de Análise e Modelagem de Sistemas. O objetivo é criar um sistema em Java capaz de gerenciar uma frota de veículos de uma empresa de transporte, incluindo seus respectivos proprietários.

## 📋 Descrição do Sistema

O sistema permite o cadastro e a visualização de veículos do tipo:

- Carro (com quantidade de portas e tipo de combustível),
- Moto (com cilindrada em cc),
- Caminhão (com capacidade máxima de carga em toneladas).

Cada veículo está obrigatoriamente associado a um proprietário (pessoa física ou jurídica), que pode existir no sistema mesmo sem veículos cadastrados.

### Informações armazenadas:

#### Proprietário
- Nome
- CPF ou CNPJ

#### Veículo (comum a todos)
- Placa
- Modelo
- Ano de fabricação

#### Específicos:
- **Carro:** quantidade de portas, tipo de combustível
- **Moto:** cilindrada (mínimo 100cc)
- **Caminhão:** capacidade máxima de carga (mínimo 1 tonelada)

## ✅ Regras de Negócio

- Nenhum veículo pode ter placa vazia ou nula.
- Ano de fabricação não pode ser anterior a 2000.
- Motos devem ter no mínimo 100cc.
- Caminhões devem ter no mínimo 1 tonelada de capacidade de carga.
- Carros devem ter no mínimo 2 portas.

## 🔧 Tecnologias Utilizadas

- Java 17+
- VSCodium ou VS Code com extensão RedHat Java
- Git para versionamento

## 📁 Estrutura do Projeto

