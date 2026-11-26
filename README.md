# Radar inteligente com IA

Descrição do Projeto
O Radar Inteligente é um sistema desenvolvido em Java capaz de simular a detecção de veículos e o cálculo de velocidade através da passagem por dois pontos de controle (Linha A e Linha B).

O projeto foi estruturado de forma modular para permitir futura integração com tecnologias de Visão Computacional e Inteligência Artificial, como OpenCV e YOLO, possibilitando a detecção automática de veículos através de câmeras.

🎯 Objetivos
Detectar veículos utilizando um módulo de IA.
Registrar a passagem do veículo pela Linha A.
Registrar a passagem do veículo pela Linha B.
Calcular a velocidade do veículo.
Indicar se a velocidade está dentro do limite estabelecido.
Permitir integração futura com webcams e modelos de visão computacional.

Descrição das Classes
Vehicle.java

Representa o veículo identificado pelo sistema.

Responsabilidades:

Armazenar informações do veículo.
Permitir futuras expansões, como identificação de placa.
Detection.java

Representa o resultado da detecção realizada pela IA.

Responsabilidades:

Armazenar informações detectadas.
Informar o nível de confiança da detecção.
ModelLoader.java

Responsável pelo carregamento do modelo de IA.

Responsabilidades:

Inicializar modelos de detecção.
Facilitar futura integração com OpenCV ou YOLO.
VehicleDetector.java

Simula o módulo de Inteligência Artificial.

Responsabilidades:

Detectar veículos.
Retornar informações do veículo identificado.

Exemplo:

Java
Vehicle vehicle =
detector.detectVehicle();
LineCrossingDetector.java

Responsável pelo monitoramento das linhas de referência.

Responsabilidades:

Detectar passagem pela Linha A.
Detectar passagem pela Linha B.
Registrar os horários de passagem.
SpeedCalculator.java

Responsável pelo cálculo da velocidade.

Fórmula utilizada:

Plain Text
Velocidade = Distância / Tempo

Conversão para km/h:

Plain Text
km/h = m/s × 3,6
RadarSystem.java

Classe principal da lógica do radar.

Responsabilidades:

Integrar todos os módulos.
Controlar o fluxo do sistema.
Monitorar a passagem do veículo.
Acionar o cálculo da velocidade.
Main.java

Ponto de entrada da aplicação.

Responsabilidades:

Inicializar o sistema.
Executar a simulação completa.
🔄 Fluxo de Funcionamento
Plain Text
Inicialização
↓
Detecção do veículo
↓
Passagem pela Linha A
↓
Início da contagem de tempo
↓
Passagem pela Linha B
↓
Fim da contagem de tempo
↓
Cálculo da velocidade
↓
Exibição do resultado
💡 Exemplo de Saída
Plain Text
=================================
RADAR INTELIGENTE
=================================

IA identificou:
Tipo: Carro
Placa: ABC-1234

[LINHA A] Veículo detectado

[LINHA B] Veículo detectado

Tempo percorrido: 3.001 segundos

Velocidade calculada: 59.98 km/h

✓ Dentro do limite permitido
🤖 Inteligência Artificial

Nesta versão foi utilizada uma simulação do módulo de IA para validar a arquitetura do sistema.

A estrutura do projeto foi preparada para integração futura com bibliotecas de Visão Computacional, incluindo:

OpenCV
YOLO
TensorFlow Java

Essa abordagem permite substituir a simulação atual por um mecanismo real de detecção sem necessidade de alteração significativa na arquitetura do sistema.

🔧 Tecnologias Utilizadas
Java
Programação Orientada a Objetos (POO)
Visão Computacional (Arquitetura preparada)
Inteligência Artificial (Arquitetura preparada)
🚀 Possíveis Melhorias Futuras
Integração com webcam.
Detecção de veículos em tempo real.
Reconhecimento de placas.
Registro automático de infrações.
Interface gráfica em Java Swing.
Integração com banco de dados.
Geração de relatórios.
👥 Equipe

Projeto desenvolvido para a disciplina de Inteligência Artificial.

Universidade Católica de Pernambuco (UNICAP)

Curso: Sistemas para Internet


---

💡 **Uma sugestão para impressionar ainda mais o professor:** criar também um arquivo chamado `ARQUITETURA.md` com um diagrama simples mostrando a comunicação entre `VehicleDetector`, `LineCrossingDetector`, `SpeedCalculator` e `RadarSystem`. Muitos grupos entregam apenas código; uma documentação de arquitetura passa uma imagem muito mais profissional e organizada do projeto.