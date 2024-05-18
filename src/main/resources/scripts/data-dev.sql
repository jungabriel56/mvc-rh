insert into funcionarios (id, nome_funcionario, data_entrada) values(nextval('funcionarios_seq'),'Pele', '1955-12-31');
insert into funcionarios (id, nome_funcionario, data_entrada) values(nextval('funcionarios_seq'),'AFF', '2002-12-31');
insert into funcionarios (id, nome_funcionario, data_entrada) values(nextval('funcionarios_seq'),'SID', '1995-02-21');

insert into departamentos(id, nome) values (nextval('departamentos_seq'), 'RH');
insert into departamentos(id, nome) values (nextval('departamentos_seq'), 'Financeiro');
insert into departamentos(id, nome) values (nextval('departamentos_seq'), 'TECH');

insert into cargos(id, nome, id_departamento_fk) values (nextval('cargos_seq'), 'Analista 1', 1);
insert into cargos(id, nome, id_departamento_fk) values (nextval('cargos_seq'), 'Analista 2', 1);
insert into cargos(id, nome, id_departamento_fk) values (nextval('cargos_seq'), 'Gerente', 51);
insert into cargos(id, nome, id_departamento_fk) values (nextval('cargos_seq'), 'Médico', 51);
insert into cargos(id, nome, id_departamento_fk) values (nextval('cargos_seq'), 'Assistente', 101);
